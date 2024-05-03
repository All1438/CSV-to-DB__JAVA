package csvtodb;

import csvtodb.controller.ReadCSV;

public class App {
    // declaration des exceptions
    public static void main(String[] args) {
        String fileName = "/home/ali/ali_nando/projets_java/csv/base.csv";

        ReadCSV.read(fileName);

    }
}
