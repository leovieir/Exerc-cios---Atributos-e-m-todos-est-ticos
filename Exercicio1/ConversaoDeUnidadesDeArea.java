public class ConversaoDeUnidadesDeArea{
  public static float converterMetrosEmPes(float areaEmMetros){
    float areaEmPes = areaEmMetros * 10.76f;

    return areaEmPes;
  }

  public static float converterPesEmCentimetros(float areaEmPes){
    float areaEmCentimetros = areaEmPes * 929.0f;

    return areaEmCentimetros;
  }

  public static float converterMilhasEmAcres(float areaEmMilhas){
    float areaEmAcres = areaEmMilhas * 640.0f;

    return areaEmAcres;
  }

  public static float converterAcresEmPes(float areaEmAcres){
    float areaEmPes = areaEmAcres * 43560.0f;

    return areaEmPes;
  }




}