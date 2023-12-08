package crud.repository;


import crud.conn.ConnectionFactory;
import crud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("Find Producer by Producers by name '{}'" ,name);
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByname(conn, name)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByname(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn,id)) {
            ps.execute();
            log.info("Deleted producer '{}' in the database",id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        return ps;
    }

    public static void save(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}'  , rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static  PreparedStatement createPrepareStatementSave(Connection conn,Producer producer) throws SQLException {
            String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
            PreparedStatement ps = conn.prepareStatement(sql));
            ps.setString(1,producer.getName());
            ps.setInt(2,producer.getId());
            return ps;
    }
}
