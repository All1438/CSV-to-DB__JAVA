package csvtodb.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import csvtodb.entity.BaseSourcing;

public class ReadCSV {

    public static void read(String fileName) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(fileName));
            List<String[]> rows = csvReader.readAll();

            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();

            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();

                for (String[] row : rows) {
                    BaseSourcing baseSourcing = new BaseSourcing();
                    baseSourcing.setNom(row[0]);
                    baseSourcing.setPrenom(row[1]);
                    baseSourcing.setDiplome(row[2]);
                    baseSourcing.setNumero(row[3]);

                    session.save(baseSourcing);
                }

                transaction.commit();
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
