package academy.devdojo.maratonajava.javacore.JDBC.listener;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;


@Log4j2
public class CustomRowSetListaner implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command execute triggered");
    }

    @SneakyThrows
    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row insered, update or deleted");
        if (event.getSource() instanceof RowSet) {
            ((RowSet)event.getSource()).execute();
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursor moved");
    }
}
