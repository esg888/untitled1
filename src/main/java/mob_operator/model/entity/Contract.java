package mob_operator.model.entity;

import java.util.List;
import java.util.Objects;

public class Contract {

    private long id;
    private String number;
    private boolean block; //true -number is  blocking
    private boolean blockByCustomer; //true - blockByCustomer
    private List<Opt> optList;
    private List<Tariff> tariffList;
public Contract (){}

public static class Bulder {
    private long id;
    private String number;
    private boolean block; //true -number is  blocking
    private boolean blockByCustomer; //true - blockByCustomer
    private List<Opt> optList;
    private List<Tariff> tariffList;}
}

