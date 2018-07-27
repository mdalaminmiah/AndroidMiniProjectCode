package com.example.isdllab.getlink;

public class CustomAdapter {
  private String name;
  private String link;
  private int pic;

    public CustomAdapter(String name, String link, int pic) {
        this.name = name;
        this.link = link;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public int getPic() {
        return pic;
    }
}
