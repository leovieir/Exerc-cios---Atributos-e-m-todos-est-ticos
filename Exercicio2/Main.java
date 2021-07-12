class Main {
  public static void main(String[] args) {
    System.out.println("Área de um campo de futebol é:");
    System.out.println("8.250 metros quadrados");
    System.out.println(ConversaoDeUnidadesDeArea.converterMetrosEmPes(8250) + " pés quadrados");
    System.out.println(ConversaoDeUnidadesDeArea.converterMetrosEmAcres(8250) + " acres");
    System.out.println(ConversaoDeUnidadesDeArea.converterMetrosEmCentimetros(8250) + " centímetros quadrados");
  }
}