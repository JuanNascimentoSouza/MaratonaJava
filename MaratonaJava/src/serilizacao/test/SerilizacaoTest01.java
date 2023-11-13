package serilizacao.test;

import serilizacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerilizacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L,"Juan","1234567");
        serializar(aluno);
    }
        private static void serializar(Aluno aluno){
            Path path = Paths.get("pasta/Aluno.ser");
                try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){

                }catch(IOException e){
                    e.printStackTrace();
                }
        }



    }

