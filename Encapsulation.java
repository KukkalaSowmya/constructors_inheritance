class Owner {
  private int key;

  public int getKey() {
    return key;
  }

  public static void mainsetKey(int key) {
    this.key = key;
  }
}

class Neighbor {

  public static void main(String l[]) {
    Owner o = new Owner();
    o.setKey(4444);

    System.out.println(o.getKey());

  }
}