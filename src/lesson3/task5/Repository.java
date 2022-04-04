package lesson3.task5;

import lesson3.task5.Products.*;

public class Repository {
    private Technics[] technics = new Technics[10];

    public void loadPtoducts() {
        technics[0] = new SonyGame(Color.BLACK, "PlayStation 4", 35000, "A3265B12",100);
        technics[1] = new SonyGame(Color.BLACK, "PlayStation 4 pro", 39000, "A3265B14",101);
        technics[2] = new SonyGame(Color.BLACK, "PlayStation 5 DE", 60000, "C3267B02",102);
        technics[3] = new AppleHome(Color.WHITE, "AppleTV", 10000, "321231М321",103);
        technics[4] = new AppleHome(Color.CUSTOM, "AppleTV", 10000, "321231М221",104);
        technics[5] = new LuckyGoldstarPC(Color.WHITE, "Игровой RTX+", 80000, "mC32112",105);
        technics[6] = new LuckyGoldstarPC(Color.BLACK, "Не очень игровой", 50000, "Tfd123300",106);
        technics[7] = new ApplePC(Color.WHITE, "MacBook 12", 100000, "Apple1200032",107);
        technics[8] = new SonyHome(Color.GREY, "Микроволновка A30", 45000, "QW125005",108);
        technics[9] = new SonyHome(Color.GREY, "Холодильник", 790000, "QW122605",109);
    }

    public Technics[] getTechnics() {
        return technics;
    }

    public void setTechnics(Technics[] technics) {
        this.technics = technics;
    }
}
