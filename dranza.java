public class dranza extends beyblade{
    private String kutsalCanavar;

    public dranza(String beybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar){
        super(beybladeci,donusHizi, saldiriGucu);
        this.setKutsalCanavar(kutsalCanavar);
    }
    public void kutsalCanavariCikar(){
        System.out.println(getBeybladeci()+" "+kutsalCanavar+"ı ortaya cıkarır.");
        System.out.println(getBeybladeci()+" "+"ın saldırısı: Alev Kılıcı");

    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Kutsal canavarı: "+kutsalCanavar);
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }
}

