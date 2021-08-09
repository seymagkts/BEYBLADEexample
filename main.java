import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Cıkıs icin q'ya basiniz");

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Hangi beybladei üretmek istiyorsunuz?");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Program sonlandırılıyor...");
                break;
            }else{
                beybladeFabrikasi bF=new beybladeFabrikasi();
                beyblade beyblade=bF.beybladeUret(islem);

                if(beyblade==null){
                    System.out.println("Gecerli bir beyblade girin...");
                }else {
                    beyblade.bilgiGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavariCikar();
                }
            }
        }
    }
}
