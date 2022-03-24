package br.touchetimeapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_athlete")
public class Athlete implements Serializable {

    private static final Long serialVersionsUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer win;
    private Integer defeat;
    private Integer fight;
    private Integer weight;
    private String years;
    private String style;

    public Athlete(Long id, String name, Integer win, Integer defeat, Integer fight, Integer weight, String years, String style) {
        this.id = id;
        this.name = name;
        this.win = win;
        this.defeat = defeat;
        this.fight = fight;
        this.weight = weight;
        this.years = years;
        this.style = style;
    }

    public Athlete(String name) {
        this.name = name;
    }

    public Athlete() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getDefeat() {
        return defeat;
    }

    public void setDefeat(Integer defeat) {
        this.defeat = defeat;
    }

    public Integer getFight() {
        return fight;
    }

    public void setFight(Integer fight) {
        this.fight = fight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
