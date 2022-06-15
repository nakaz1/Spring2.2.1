package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Column(name = "model")
    private String model;

    @Id
    @Column(name = "series")
    private int series;

    public Car(){

    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @OneToOne()
    @JoinColumn()
    private User user;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", series=" + series;

    }
}
