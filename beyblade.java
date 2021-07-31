public class beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public beyblade(String beybladeci,int donusHizi,int saldiriGucu){
        this.setBeybladeci(beybladeci);
        this.setDonusHizi(donusHizi);
        this.setSaldiriGucu(saldiriGucu);
    }
    public void saldir(){
        System.out.println(getBeybladeci()+" "+ saldiriGucu +" "+ donusHizi +" ile saldırıyor...");
    }
    public void kutsalCanavariCikar(){
        System.out.println("Kutsal canavara sahip değil.");
    }
    public void bilgiGoster(){
        System.out.println("Beyblade: "+beybladeci);
        System.out.println("Donuz hızı: "+donusHizi);
        System.out.println("Saldırı gucu: "+saldiriGucu);
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

}
