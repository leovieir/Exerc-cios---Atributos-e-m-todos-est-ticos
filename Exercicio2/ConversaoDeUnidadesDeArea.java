public class ConversaoDeUnidadesDeArea{
  public static float converterMetrosEmPes(float areaEmMetros){
    float areaEmPes = areaEmMetros * 10.76f;

    return areaEmPes;
  }

  public static float converterPesEmCentimetros(float areaEmPes){
    float areaEmCentimetros = areaEmPes * 929.0f;

    return areaEmCentimetros;
  }

  public static float converterMetrosEmCentimetros(float areaEmMetros){
    float areaEmCentimetros = areaEmMetros * 10000.0f;
    
    return areaEmCentimetros;
  }

  public static float converterMetrosEmAcres(float areaEmMetros){
    float areaEmAcres = areaEmMetros / 4046.8564224f;
    
    return areaEmAcres;
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