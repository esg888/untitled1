package mob_operator.model.entity;

import java.util.List;
import java.util.Objects;

public class Contract {

    private long id;
    private String number;
    private boolean block; //true -number is  blocking
    private boolean blockByCustomer; //true - blockByCustomer
    private List<Opt> optList;
    private String tariff;
public Contract (){}

    public static class Builder {

        private long id;
        private String number;
        private boolean block; //true -number is  blocking
        private boolean blockByCustomer; //true - blockByCustomer
        private List<Opt> optList;
        private String tariff;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public Builder setBlock(boolean block) {
            this.block = block;
            return this;
        }

        public Builder setBlockByCustomer(boolean blockByCustomer) {
            this.blockByCustomer = blockByCustomer;
            return this;
        }

        public Builder setOptList(List<Opt> optList) {
            this.optList = optList;
            return this;
        }

        public Builder setTariff(String tariff) {
            this.tariff = tariff;
            return this;
        }

        public Contract build() {
            return new Contract(this);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean isBlockByCustomer() {
        return blockByCustomer;
    }

    public void setBlockByCustomer(boolean blockByCustomer) {
        this.blockByCustomer = blockByCustomer;
    }

    public List<Opt> getOptList() {
        return optList;
    }

    public void setOptList(List<Opt> optList) {
        this.optList = optList;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return id == contract.id && block == contract.block && blockByCustomer == contract.blockByCustomer && Objects.equals(number, contract.number) && Objects.equals(optList, contract.optList) && Objects.equals(tariff, contract.tariff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, block, blockByCustomer, optList, tariff);
    }

    private Contract(Builder builder){
            this.id= builder.id;
            this.tariff= builder.tariff;
            this.block=builder.block;
            this.number= builder.number;
            this.blockByCustomer= builder.blockByCustomer;
            this.optList=builder.optList;



    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", block=" + block +
                ", blockByCustomer=" + blockByCustomer +
                ", optList=" + optList +
                ", tariff='" + tariff + '\'' +
                '}';
    }
}

