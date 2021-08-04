public enum Season {

  SPRING("Xuân"),
  SUMMER("Hè"),
  AUTUMN("Thu"),
  WINTER("Đông");

  String value;

  Season(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
