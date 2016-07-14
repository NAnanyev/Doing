package main.abstractPlain;

/**
 * Created by Ananyeu_NA on 13.07.2016.
 */
public class AbstractPlain {
    private Integer length;
    private Integer heigth;
    private Integer maxFligth;
    private Integer maxSpeed;
    private Integer people;
    private Integer bomb;
    private Integer weigth;
    private String type;

    public AbstractPlain(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer people, Integer bomb, Integer weigth, String type) {
        this.length = length;
        this.heigth = heigth;
        this.maxFligth = maxFligth;
        this.maxSpeed = maxSpeed;
        this.people = people;
        this.bomb = bomb;
        this.weigth = weigth;
        this.type = type;
    }

    @Override
    public String toString() {
        return "AbstractPlain{" +
                "length=" + length +
                ", heigth=" + heigth +
                ", maxFligth=" + maxFligth +
                ", maxSpeed=" + maxSpeed +
                ", people=" + people +
                ", bomb=" + bomb +
                ", weigth=" + weigth +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractPlain that = (AbstractPlain) o;

        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (heigth != null ? !heigth.equals(that.heigth) : that.heigth != null) return false;
        if (maxFligth != null ? !maxFligth.equals(that.maxFligth) : that.maxFligth != null) return false;
        if (maxSpeed != null ? !maxSpeed.equals(that.maxSpeed) : that.maxSpeed != null) return false;
        if (people != null ? !people.equals(that.people) : that.people != null) return false;
        if (bomb != null ? !bomb.equals(that.bomb) : that.bomb != null) return false;
        if (weigth != null ? !weigth.equals(that.weigth) : that.weigth != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;

    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (heigth != null ? heigth.hashCode() : 0);
        result = 31 * result + (maxFligth != null ? maxFligth.hashCode() : 0);
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        result = 31 * result + (people != null ? people.hashCode() : 0);
        result = 31 * result + (bomb != null ? bomb.hashCode() : 0);
        result = 31 * result + (weigth != null ? weigth.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public Integer getMaxFligth() {
        return maxFligth;
    }

    public void setMaxFligth(Integer maxFligth) {
        this.maxFligth = maxFligth;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getBomb() {
        return bomb;
    }

    public void setBomb(Integer bomb) {
        this.bomb = bomb;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
