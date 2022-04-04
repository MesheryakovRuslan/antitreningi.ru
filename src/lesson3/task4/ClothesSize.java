package lesson3.task4;

public enum ClothesSize {
    XXS(32){
        @Override
        public  String getDescription(){
            return "Детский размер";
        }
    },XS(34),S(36),M(38),L(40);
    int euroSize;

    ClothesSize(int euroSize){
        this.euroSize = euroSize;
    }
    public  String getDescription(){
        return "Взрослый размер";
    };
}
