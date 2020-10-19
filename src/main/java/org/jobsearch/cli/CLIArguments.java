package org.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    @Parameter(
            required = true,
            descriptionKey = "Palabra clave",
            description = "Palabra clave")
    private String keyword;
    @Parameter(
            names = {"--location", "-l"},
            description = "La busqueda puede incluir un lugar en especifico"
    )
    private String location;
    @Parameter(
            names = {"--page", "-p"},
            description = "La página devuelve 50 elementos"
    )
    private int page;
    @Parameter(
            names = {"--fulltime", "-ft"},
            description = "Se especifica la busqueda puede tener tiempo completo"
    )
    private boolean isFulltime = false;
    @Parameter(
            names = {"--markdown", "-md"},
            description = "Se especifica la busqueda puede tener MarkDown"
    )
    private boolean isMarkDown = false;
    @Parameter(
            names = {"--help", "-h"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Disponibilidad de la ayuda"
    )
    private boolean isHelp;

    private CLIArguments() {

    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }

    @Override
    public String toString() {
        return "CLIArguments{" + "keyword=" + keyword + ", location=" + location + ", page=" + page + ", isFulltime=" + isFulltime + ", isMarkDown=" + isMarkDown + ", isHelp=" + isHelp + '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isIsFulltime() {
        return isFulltime;
    }

    public void setIsFulltime(boolean isFulltime) {
        this.isFulltime = isFulltime;
    }

    public boolean isIsMarkDown() {
        return isMarkDown;
    }

    public void setIsMarkDown(boolean isMarkDown) {
        this.isMarkDown = isMarkDown;
    }

    public boolean isIsHelp() {
        return isHelp;
    }

    public void setIsHelp(boolean isHelp) {
        this.isHelp = isHelp;
    }
}
