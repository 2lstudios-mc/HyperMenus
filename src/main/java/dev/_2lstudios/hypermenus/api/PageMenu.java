package dev._2lstudios.hypermenus.api;

public class PageMenu extends Menu {
    private Menu prevMenu;
    private Menu nextMenu;
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

    public Menu getPrevMenu() {
        return prevMenu;
    }

    public PageMenu setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;

        return this;
    }

    public Menu getNextMenu() {
        return nextMenu;
    }

    public PageMenu setNextMenu(Menu nextMenu) {
        this.nextMenu = nextMenu;

        return this;
    }
}
