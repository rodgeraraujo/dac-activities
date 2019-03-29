package br.edu.ifpb.dac.sessionbeans.model;

import br.edu.ifpb.dac.sessionbeans.model.Style;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Album implements Serializable {
    private Style style; //Rock, Pop, Sertanejo
    private Band band;
    private LocalDate releaseYear;

    public Album() {
    }

    public Album(Style style, Band band, LocalDate releaseYear) {
        this.style = style;
        this.band = band;
        this.releaseYear = releaseYear;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        Album album = (Album) o;
        return getStyle() == album.getStyle() &&
                getBand().equals(album.getBand()) &&
                getReleaseYear().equals(album.getReleaseYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStyle(), getBand(), getReleaseYear());
    }

    @Override
    public String toString() {
        return "Album{" +
                "style=" + style +
                ", band=" + band +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
