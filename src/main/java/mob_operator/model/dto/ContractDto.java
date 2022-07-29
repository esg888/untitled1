package mob_operator.model.dto;


import mob_operator.model.entity.Contract;

public class ContractDto {
    private long id;
    private String number;
    private boolean block;
    private boolean blockByCustomer;

    public ContractDto(){}

    private ContractDto (Builder builder)
    {
this.id= builder.id;
this.number= builder.number;
this.block= builder.block;
this.blockByCustomer= builder.blockByCustomer;
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

    public static class Builder {
        private long id;
        private String number;
        private boolean block;
        private boolean blockByCustomer;

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

        public ContractDto build() {return new ContractDto(this);}

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", number='" + number + '\'' +
                    ", block=" + block +
                    ", blockByCustomer=" + blockByCustomer +
                    '}';
        }
    }


}
