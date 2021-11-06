package dev._2lstudios.hypermenus.api;

public class PageMenu extends Menu {
    private int page;

    public PageMenu(final int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public PageMenu setPage(final int page) {
        this.page = page;

        return this;
    }
}
