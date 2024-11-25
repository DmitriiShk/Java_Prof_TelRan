package SummarySessions.SumSes_221124;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<Optional<String>> optionalOptional = Optional.of(Optional.of("Data"));
        Optional<String> optional = optionalOptional.flatMap(s -> s);
        System.out.println(optional.get());
        System.out.println();

        Optional<Integer> integerOptional = optional.map(s -> s.length());
        System.out.println(integerOptional.get());

        Insurance insurance = new Insurance("Insurance Data");

    }

static class Car{
        private Optional<Insurance> insurance;

        public Car(){
            this.insurance = Optional.empty();
        }

        public Car (Insurance insurance) {
            this.insurance = Optional.of(insurance);
        }

        public Optional<Insurance> getInsurance(){
            return insurance;
        }
}

static class Insurance{
    private Optional<String> info;

    public Insurance(){
        this.info = Optional.of(String.valueOf(info));
    }

    public Insurance(String info) {
        this.info = Optional.of(info);
    }

    public Optional<String> getInfo(){
        return info;
    }

}

}


