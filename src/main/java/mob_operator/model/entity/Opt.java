package mob_operator.model.entity;

import java.util.List;
import java.util.Objects;

public class Opt {

    private long id;
    private String optName;
    private double optPrice;
    private double optCost;
    private List<Tariff> tariffList;

public Opt(){}

    public  static  class  Builder {
        private long id;
        private String optName;
        private double optPrice;
        private double optCost;
        private List<Tariff> tariffList;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setOptName(String optName) {
            this.optName = optName;
            return this;
        }

        public Builder setOptPrice(double optPrice) {
            this.optPrice = optPrice;
            return this;
        }

        public Builder setOptCost(double optCost) {
            this.optCost = optCost;
            return this;
        }

        public Builder setTariffList(List<Tariff> tariffList) {
            this.tariffList = tariffList;
            return this;
        }

        public Opt build() {
            return new Opt(this);
        }
    }
        public long getId() {
            return id;
        }

        public String getOptName() {
            return optName;
        }

        public double getOptPrice() {
            return optPrice;
        }

        public double getOptCost() {
            return optCost;
        }

        public List<Tariff> getTariffList() {
            return tariffList;
        }

        private Opt (.Builder builder){
            this.id= builder.id;
            this.optCost= builder.optCost;
            this.optPrice= builder.optPrice;
            this.optName= builder.optName;
            this.tariffList=builder.tariffList;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return id == builder.id && Double.compare(builder.optPrice, optPrice) == 0 && Double.compare(builder.optCost, optCost) == 0 && Objects.equals(optName, builder.optName) && Objects.equals(tariffList, builder.tariffList);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, optName, optPrice, optCost, tariffList);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", optName='" + optName + '\'' +
                    ", optPrice=" + optPrice +
                    ", optCost=" + optCost +
                    ", tariffList=" + tariffList +
                    '}';

    }

}
