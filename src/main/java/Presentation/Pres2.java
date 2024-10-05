package Presentation;

import DAO.IDao;
import METIER.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName); // Au moment de l'execution elle va chercher si cette classe existe et si oui il va la charger dans la mémoire
        // C'est la programmarion dynamique
        IDao dao = (IDao) cDao.newInstance();
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("Res = " +metier.calcul());

    }
}
