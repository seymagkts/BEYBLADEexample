public class dragon extends beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public dragon(String beybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar,String gizliYetenek){
        super(beybladeci,donusHizi, saldiriGucu);
        this.setKutsalCanavar(kutsalCanavar);
        this.gizliYetenek=gizliYetenek;
    }
    public void kutsalCanavariCikar(){
        System.out.println(getBeybladeci()+" "+kutsalCanavar+"ı ortaya cıkarır.");
        System.out.println(getBeybladeci()+" "+"ın saldırısı: Hayalet Kargası");

    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Kutsal canavarı: "+kutsalCanavar);
        System.out.println("Gizli yeteneği: "+gizliYetenek);
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getGizliYetenek() {
        return gizliYetenek;
    }

    public void setGizliYetenek(String gizliYetenek) {
        this.gizliYetenek = gizliYetenek;
    }
}
