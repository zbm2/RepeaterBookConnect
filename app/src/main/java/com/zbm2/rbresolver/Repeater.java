package com.zbm2.rbresolver;

/* Full List of RB Content Provider attributes
 factory Repeater.fromContentValues(ContentValues contentValues) => Repeater(
        id: contentValues.getInt('id')!,
        Call: contentValues.getString('Call')!,
        Band: contentValues.getString('Band')!,
        RX: contentValues.getDouble('RX')!,
        TX: contentValues.getDouble('TX')!,
        Offset: contentValues.getString('Offset')!, // Double ?
        Services: contentValues.getInt('Services')!,
        Access: contentValues.getInt('Access')!,
        CTCSS: contentValues.getDouble('CTCSS')!,
        DCS: contentValues.getInt('DCS')!,
        IRLP_node: contentValues.getString('IRLP_node')!, //Dynamic
        ECHOLINK_node: contentValues.getString('ECHOLINK_node')!, //Dynamic
        DStar_node: contentValues.getString('DStar_node')!, //Dynamic
        AllStar_node: contentValues.getString('AllStar_node')!, //Dynamic
        WIRES_node: contentValues.getString('WIRES_node')!, //Dynamic
        EmergencyNet: contentValues.getInt('EmergencyNet')!,
        Location: contentValues.getString('Location')!,
        County: contentValues.getString('County')!,
        State: contentValues.getString('State')!,
        Province: contentValues.getString('Province')!,
        Lat: contentValues.getDouble('Lat')!,
        Lng: contentValues.getDouble('Lng')!,
        Country: contentValues.getString('Country')!,
        URL: contentValues.getString('URL')!,
        NotesFeatures: contentValues.getString('NotesFeatures')!,
        NotesAccess: contentValues.getString('NotesAccess')!,
        Updated: contentValues.getString('Updated')!,
        By: contentValues.getString('By')!,
        RBID: contentValues.getString('RBID')!,
        OpStatus: contentValues.getInt('OpStatus')!,
        DMR_Text: contentValues.getString('DMR_Text')!,
        NAC: contentValues.getString('NAC')!,
        NotesLinks: contentValues.getString('NotesLinks')!,
        DTMF: contentValues.getString('DTMF')!,
        Region: contentValues.getString('Region')!,
        ASL: contentValues.getString('ASL')!,
        Power: contentValues.getString('Power')!,
        DMRID: contentValues.getString('DMRID')!,
        DMRNetwork: contentValues.getString('DMRNetwork')!,
        M17CAN: contentValues.getInt('M17CAN')!,
        Distance: contentValues.getDouble('Distance')!,
        CompassHeading: contentValues.getString('CompassHeading')!,
        Bearing: contentValues.getDouble('Bearing')!,
        BearingSort: contentValues.getString('BearingSort')!,
        ServiceTxt: contentValues.getString('ServiceTxt')!,
        BandSort: contentValues.getInt('BandSort')!,
      );

 int id;
  String Call;
  String Band;
  double RX;
  double TX;
  String Offset;
  int Services;
  int Access;
  double CTCSS;
  int DCS;
  dynamic IRLP_node;
  dynamic ECHOLINK_node;
  dynamic DStar_node;
  dynamic AllStar_node;
  dynamic WIRES_node;
  int EmergencyNet;
  String Location;
  String County;
  String State;
  String Province;
  double Lat;
  double Lng;
  String Country;
  String URL;
  String NotesFeatures;
  String NotesAccess;
  String Updated;
  String By;
  String RBID;
  int OpStatus;
  String DMR_Text;
  String NAC;
  String NotesLinks;
  String DTMF;
  String Region;
  String ASL;
  String Power;
  String DMRID;
  String DMRNetwork;
  int M17CAN;

  // String Notes;
  double Distance;
  String CompassHeading;
  double Bearing;
  String BearingSort;
  String ServiceTxt;
  int BandSort;
 */

public class Repeater {
    private final long id;
    private final String call;
    private final String location;
    private final Double distance;
    private final String compassHeading;
    private final String serviceTxt;
    private final Double RX;
    private final Double TX;
    private final String Offset;
    private final Double CTCSS;
    private final Integer DCS;

    public Repeater(long id, String call, String location, Double distance, String compassHeading, String serviceTxt, Double RX, Double TX, String Offset, Double CTCSS, Integer DCS) {
        this.id = id;
        this.call = call;
        this.location = location;
        this.distance = distance;
        this.compassHeading = compassHeading;
        this.serviceTxt = serviceTxt;
        this.RX = RX;
        this.TX = TX;
        this.Offset = Offset;
        this.CTCSS = CTCSS;
        this.DCS = DCS;
    }

    public long getId() {
        return id;
    }
    public String getCall() {
        return call;
    }
    public String getLocation() { return location;}
    public Double getDistance() { return distance;}
    public String getCompassHeading() { return compassHeading;}
    public String getserviceTxt() { return serviceTxt;}
    public Double getRX() { return RX;}
    public Double getTX() { return TX;}
    public String getOffset() { return Offset;}
    public Double getCTCSS() { return CTCSS;}
    public Integer getDCS() { return DCS;}
}
