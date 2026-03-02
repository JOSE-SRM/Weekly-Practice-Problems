class DistanceConverter{
  public static void main(String[] args) {
    double distanceInKilometer = 10.8;
    double kilometeToMilesRatio = 1.6;
    
    double distanceInMiles = distanceInKilometer * kilometeToMilesRatio;

    System.out.println("Distance in Kilometer: " + distanceInKilometer +"\nDistance in Miles: " + distanceInMiles);
  }
}
