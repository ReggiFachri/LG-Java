package com.lgcns.mission.travel.test;

import com.lgcns.mission.travel.IndividualTravel;
import com.lgcns.mission.travel.PackageTravel;
import com.lgcns.mission.travel.Travel;
import com.lgcns.mission.util.MissionUtil;

public class TravelTestSolution {
    
    public static void main( String[] args ) {
        
        Travel[] travels = {
                new IndividualTravel( "TRV001", "Munich", "German Airlines", 10 ),
                new IndividualTravel( "TRV002", "Praha", "AirFrance", 20 ),
                new PackageTravel( "TRV003", "LA", "Delta Airlines", 8 ),
                new IndividualTravel( "TRV004", "Osaka", "Korean Air", 15 ),
                new PackageTravel( "TRV005", "Shanghai", "Shouthern Airlines", 12 )
        };
        
        int menu = -1;
        
        while ( menu != 9 ) {
            
            printMenu();
            menu = MissionUtil.getIntegerInput();
            
            if ( menu == 1 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                    System.out.println( travels[inx] );
                }
                printSeperator();
            } else if ( menu == 2 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
//                	if (travels[inx] instanceof IndividualTravel) {
                    if ( "Individual Travel".equals( travels[inx].getTravelType() ) ) {
                        System.out.println( travels[inx] );
                    }
                }
                printSeperator();
            } else if ( menu == 3 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                	if (travels[inx] instanceof PackageTravel) {
//                    if ( "Paket Travel".equals( travels[inx].getTravelType() ) ) {
                        System.out.println( travels[inx] );
                    }
                }
                printSeperator();
            } else if ( menu == 4 ) {
                
                System.out.print( ">> Input kode travel yang akan dipesan : " );
                String travelCode = MissionUtil.getStringInput();
                
                boolean isRightInput = false;
                
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                    if ( travelCode.equals( travels[inx].getTravelCode() ) ) {
                        isRightInput = true;
                        break;
                    }
                }
                
                if ( isRightInput ) {
                    
                    System.out.print( ">> Input jumlah orang yang akan dipesan : " );
                    int reserved = MissionUtil.getIntegerInput();
                    if(reserved < 1){
                    	System.out.println("[Error] Harap pesan setidaknya 1 orang.");
                    	continue;
                    }
                    for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                        if ( travelCode.equals( travels[inx].getTravelCode() ) ) {
                            travels[inx].setReserved( reserved );
                        }
                    }
                } else {
                    System.out.println( "[Error] Kode yang diinput salah." );
                }
            } else if ( menu == 9 ) {
                System.out.println( ">> Selesai!!" );
            } else {
                System.out.println( ">> silahkan input kembali!!" );
            }
        }
    }
    
    public static void printMenu() {
        System.out.println( "========== < Menu > ==========" );
        System.out.println( " 1. Periksa semua produk travel" );
        System.out.println( " 2. Periksa produk individual" );
        System.out.println( " 3. Permintaan produk paket travel" );
        System.out.println( " 4. Reservasi produk travel" );
        System.out.println( " 9. End" );
        System.out.println( "==============================" );
        System.out.print( "## Menu : " );
    }
    
    public static void printHeader() {
        printSeperator();
        System.out.println( "Kode Travel\tNama Kota\tPenerbangan\tJenis Travel\t\tJumlah minimum orang yang boleh berangkat\tMaksimal orang yang bisa reservasi\tJumlah reservasi orang" );
        printSeperator();
    }
    
    public static void printSeperator() {
        System.out.println( "------------------------------------------------------------------------------------------------" );
    }
}