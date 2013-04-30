/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Tinus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--- Pembuatan vertex/halte (start)
        Graph graph = new Graph();

//        graph.insertVortex("PRAMBANAN");
//        graph.insertVortex("JL. SOLO (KALASAN)");
//        graph.insertVortex("JL. SOLO (KR.2)");
//        graph.insertVortex("JL. SOLO (KR.1)");
//        graph.insertVortex("BANDARA ADISUCIPTO");
//        graph.insertVortex("JL. SOLO (MAGUWO)");
//        graph.insertVortex("JL. SOLO (ALFA)");
//        graph.insertVortex("JL. SOLO (JAYAKARTA)");
//        graph.insertVortex("RINGROAD UTARA (BINAMARGA)");
//        graph.insertVortex("RINGROAD UTARA (DISNAKER)");
//
//        graph.insertVortex("RINGROAD UTARA (UPN)");
//        graph.insertVortex("RINGROAD UTARA (JIH)");
//        graph.insertVortex("TERMINAL CONDONGCATUR");
//        graph.insertVortex("RINGROAD UTARA (KENTUNGAN)");
//        graph.insertVortex("RINGROAD UTARA (MANGGUNG)");
//        graph.insertVortex("RINGROAD UTARA (MONJALI 1)");
//        graph.insertVortex("RINGROAD UTARA (MONJALI 2)");
//        graph.insertVortex("TERMINAL JOMBOR");
//        graph.insertVortex("JL. KALIURANG (PERTANIAN UGM)");
//        graph.insertVortex("JL. KALIURANG (KOPMA UGM)");
//
//        graph.insertVortex("JL. COLOMBO (KOSUDGAMA)");
//        graph.insertVortex("JL. COLOMBO (PANTI RAPIH)");
//        graph.insertVortex("JL. COLOMBO (UNY)");
//        graph.insertVortex("JL. COLOMBO (SAMIRONO)");
//        graph.insertVortex("JL. SOLO (DE BRITTO)");
//        graph.insertVortex("JL. SOLO (GEDUNG WANITA)");
//        graph.insertVortex("JL. SOLO (AMBARUKMO)");
//        graph.insertVortex("JL. SOLO (JOGJA BISNIS)");
//        graph.insertVortex("JANTI FLYOVER");
//        graph.insertVortex("JL. SOLO (JANTI)");
//
//        graph.insertVortex("RINGROAD UTARA (INSTIPER 1)");
//        graph.insertVortex("RINGROAD UTARA (INSTIPER 2)");
//        graph.insertVortex("RINGROAD UTARA (STIKES GUNA BANGSA)");
//        graph.insertVortex("SUSTERAN NOVISIAT");
//        graph.insertVortex("SANTREN");
//        graph.insertVortex("KARANGJATI");
//        graph.insertVortex("FK-UGM");
//        graph.insertVortex("RSUP DR. SARDJITO");
//        graph.insertVortex("UNY");
//        graph.insertVortex("SANATA DHARMA");
//
//        graph.insertVortex("UIN SUNAN KALIJAGA 1");
//        graph.insertVortex("UIN SUNAN KALIJAGA 2");
//        graph.insertVortex("RS AU DR. S. HARDJOLUKITO");
//        graph.insertVortex("GEDONG KUNING (JEC)");
//        graph.insertVortex("GEDONG KUNING (WONOCATUR)");
//        graph.insertVortex("GEDONG KUNING (BANGUNTAPAN)");
//        graph.insertVortex("KUSUMANEGARA (GEDUNG JUANG 45)");
//        graph.insertVortex("NGEKSIGONDO (DIKLAT PU)");
//        graph.insertVortex("GEDONG KUNING (DEP.KEHUTANAN)");
//        graph.insertVortex("NGESIGONDO   (BASEN)");
//
//        graph.insertVortex("TEGAL GENDU 1");
//        graph.insertVortex("TEGAL GENDU 2");
//        graph.insertVortex("SOROGENEN (NITIKAN)");
//        graph.insertVortex("COKROAMINOTO (SMA 1)");
//        graph.insertVortex("KUSUMANEGARA (GEMBIRALOKA)");
//        graph.insertVortex("AM. SANGAJI 1 (JETIS)");
//        graph.insertVortex("AM. SANGAJI 2 (JETIS)");
//        graph.insertVortex("MANGKUBUMI 1 (TUGU)");
//        graph.insertVortex("MALIOBORO 1 (GARUDA)");
//        graph.insertVortex("MALIOBORO 2 (KEPATIHAN)");
//
//        graph.insertVortex("AHMAD YANI (BENTENG VREDEBURG)");
//        graph.insertVortex("KHA DAHLAN 1 (PAPPMI)");
//        graph.insertVortex("KHA DAHLAN 2 (NGADIWINATAN)");
//        graph.insertVortex("MANGKUBUMI 2 (PLN)");
//        graph.insertVortex("TENTARA PELAJAR 1 (SMP 14)");
//        graph.insertVortex("TENTARA PELAJAR 2 (SAMSAT)");
//        graph.insertVortex("MT HARYONO 1 (JOKTENG)");
//        graph.insertVortex("MT HARYONO 2 (SMA 7)");
//        graph.insertVortex("SUGIYONO 1 (SD PUJOKUSUMAN)");
//        graph.insertVortex("SUGIYONO 2 (MUSEUM PERJUANGAN)");
//
//        graph.insertVortex("SENOPATI 2 (TAMAN PINTAR)");
//        graph.insertVortex("SENOPATI 1 (TAMAN SENOPATI)");
//        graph.insertVortex("KATAMSO 2 (IMMACULATA)");
//        graph.insertVortex("KATAMSO 1 (PURAWISATA)");
//        graph.insertVortex("KUSUMANEGARA 1 (TMP)");
//        graph.insertVortex("KUSUMANEGARA 2 (STPP)");
//        graph.insertVortex("KUSUMANEGARA 3 (SGM)");
//        graph.insertVortex("KUSUMANEGARA 4 (GEDUNG JUANG 45)");
//        graph.insertVortex("KENARI 1 (MANDALA KRIDA)");
//        graph.insertVortex("KENARI 2 (MANDALA KRIDA)");
//
//        graph.insertVortex("SMP 5 YOGYAKARTA");
//        graph.insertVortex("URIP SUMOHARJO (LPP)");
//        graph.insertVortex("SUDRIMAN 1 (BETHESDA)");
//        graph.insertVortex("RS DR YAP");
//        graph.insertVortex("CIK DI TIRO 1 (MUSEUM KOREM)");
//        graph.insertVortex("SUDIRMAN 3 (GONDOLAYU)");
//        graph.insertVortex("SUDIRMAN 2 (BUMI PUTERA)");
//        graph.insertVortex("GIWANGAN");
//        graph.insertVortex("SOROGENEN (WIROSABAN)");
//        graph.insertVortex("TAMAN SISWA");
//
//        graph.insertVortex("AA YKPN");
//        graph.insertVortex("TEGALTURI 1");
//        graph.insertVortex("TEGALTURI 2");
//        graph.insertVortex("LOWANU");
//        graph.insertVortex("PA MUHAMMADIYAH");
//        graph.insertVortex("SMPN 11");
//        graph.insertVortex("JLAGRAN");
//        graph.insertVortex("NGABEAN");
//        graph.insertVortex("TEJOKUSUMAN");
//        graph.insertVortex("HAYAM WURUK");
//
//        graph.insertVortex("PURO PAKUALAMAN");
//        graph.insertVortex("MUSEUM BIOLOGI");
//        graph.insertVortex("APMD 1");
//        graph.insertVortex("APMD 2");
//        graph.insertVortex("SMKN 5");
//        graph.insertVortex("SGM");
//        graph.insertVortex("KOTABARU");
//        graph.insertVortex("RSI HIDAYATULAH");
//        graph.insertVortex("PASAR SENI KERAJINAN YOGYAKARTA");
//        graph.insertVortex("UAD");
//
//        graph.insertVortex("SMK MUHAMMADIYAH 3");
//        graph.insertVortex("DIPONEGORO");
//
//        //--- Pembuatan edge/jarak (start)
//        //Trayek 1A
//        graph.insertEdge("PRAMBANAN", "JL. SOLO (KR.1)", 5.396);
//        graph.insertEdge("JL. SOLO (KR.1)", "BANDARA ADISUCIPTO", 1.716);
//        graph.insertEdge("JANTI FLYOVER", "JL. SOLO (JOGJA BISNIS)", 1.387);
//        graph.insertEdge("JL. SOLO (JOGJA BISNIS)", "JL. SOLO (GEDUNG WANITA)", 1.002);
//        graph.insertEdge("JL. SOLO (GEDUNG WANITA)", "URIP SUMOHARJO (LPP)", 0.725);
//        graph.insertEdge("URIP SUMOHARJO (LPP)", "SUDRIMAN 1 (BETHESDA)", 0.898);
//        graph.insertEdge("SUDRIMAN 1 (BETHESDA)", "SUDIRMAN 2 (BUMI PUTERA)", 0.929);
//        graph.insertEdge("SUDIRMAN 2 (BUMI PUTERA)", "MANGKUBUMI 1 (TUGU)", 0.450);
////
//        graph.insertEdge("MANGKUBUMI 1 (TUGU)", "MANGKUBUMI 2 (PLN)", 0.323);
//        graph.insertEdge("MANGKUBUMI 2 (PLN)", "MALIOBORO 1 (GARUDA)", 0.856);
//        graph.insertEdge("AHMAD YANI (BENTENG VREDEBURG)", "SENOPATI 2 (TAMAN PINTAR)", 0.466);
//        graph.insertEdge("SENOPATI 2 (TAMAN PINTAR)", "PURO PAKUALAMAN", 0.900);
//        graph.insertEdge("PURO PAKUALAMAN", "KUSUMANEGARA 1 (TMP)", 0.848);
//        graph.insertEdge("KUSUMANEGARA 1 (TMP)", "KUSUMANEGARA 3 (SGM)", 1.058);
//        graph.insertEdge("KUSUMANEGARA 3 (SGM)", "KUSUMANEGARA 4 (GEDUNG JUANG 45)", 0.762);
//        graph.insertEdge("KUSUMANEGARA 4 (GEDUNG JUANG 45)", "GEDONG KUNING (JEC)", 0.703);
////
//        graph.insertEdge("BANDARA ADISUCIPTO", "JL. SOLO (KR.2)", 1.734);
//        graph.insertEdge("JL. SOLO (KR.2)", "JL. SOLO (KALASAN)", 2.661);
//        graph.insertEdge("JL. SOLO (KALASAN)", "PRAMBANAN", 3.016);
////
//        //Trayek 1B
//        graph.insertEdge("GEDONG KUNING (WONOCATUR)", "KUSUMANEGARA (GEMBIRALOKA)", 1.202);
//        graph.insertEdge("KUSUMANEGARA 3 (SGM)", "KUSUMANEGARA 2 (STPP)", 1.233);
//        graph.insertEdge("KUSUMANEGARA 2 (STPP)", "MUSEUM BIOLOGI", 0.890);
//        graph.insertEdge("MUSEUM BIOLOGI", "SENOPATI 1 (TAMAN SENOPATI)", 0.784);
//        graph.insertEdge("SENOPATI 1 (TAMAN SENOPATI)", "TENTARA PELAJAR 1 (SMP 14)", 2.840);
//        graph.insertEdge("RS DR YAP", "JL. COLOMBO (KOSUDGAMA)", 0.905);
//        graph.insertEdge("JL. COLOMBO (UNY)", "JL. SOLO (DE BRITTO)", 1.470);
//        graph.insertEdge("JL. SOLO (DE BRITTO)", "JL. SOLO (AMBARUKMO)", 0.941);
//        graph.insertEdge("JL. SOLO (AMBARUKMO)", "JANTI FLYOVER", 1.160);
//        graph.insertEdge("JANTI FLYOVER", "JL. SOLO (JANTI)", 0.611);
////
//        //Trayek 2A
//        graph.insertEdge("RINGROAD UTARA (MONJALI 1)", "AM. SANGAJI 2 (JETIS)", 3.155);
//        graph.insertEdge("AM. SANGAJI 2 (JETIS)", "MANGKUBUMI 1 (TUGU)", 0.999);
//        graph.insertEdge("SENOPATI 2 (TAMAN PINTAR)", "KATAMSO 1 (PURAWISATA)", 0.981);
//        graph.insertEdge("KATAMSO 1 (PURAWISATA)", "SUGIYONO 1 (SD PUJOKUSUMAN)", 0.791);
//        graph.insertEdge("SUGIYONO 1 (SD PUJOKUSUMAN)", "RSI HIDAYATULAH", 1.984);
//        graph.insertEdge("RSI HIDAYATULAH", "NGEKSIGONDO (DIKLAT PU)", 1.302);
//        graph.insertEdge("NGEKSIGONDO (DIKLAT PU)", "GEDONG KUNING (DEP.KEHUTANAN)", 0.764);
//        graph.insertEdge("GEDONG KUNING (DEP.KEHUTANAN)", "KUSUMANEGARA (GEMBIRALOKA)", 2.270);
//        graph.insertEdge("KUSUMANEGARA (GEMBIRALOKA)", "KUSUMANEGARA 3 (SGM)", 0.598);
////
//        graph.insertEdge("KUSUMANEGARA 3 (SGM)", "KENARI 2 (MANDALA KRIDA)", 1.676);
//        graph.insertEdge("KENARI 2 (MANDALA KRIDA)", "SMP 5 YOGYAKARTA", 2.601);
//        graph.insertEdge("SMP 5 YOGYAKARTA", "SUDRIMAN 1 (BETHESDA)", 0.981);
//        graph.insertEdge("SUDRIMAN 1 (BETHESDA)", "RS DR YAP", 0.533);
//        graph.insertEdge("RS DR YAP", "JL. COLOMBO (KOSUDGAMA)", 0.905);
//        graph.insertEdge("JL. COLOMBO (KOSUDGAMA)", "JL. COLOMBO (UNY)", 0.916);
//        graph.insertEdge("JL. COLOMBO (UNY)", "UNY", 0.512);
//        graph.insertEdge("UNY", "SANTREN", 0.958);
//        graph.insertEdge("SANTREN", "TERMINAL CONDONGCATUR", 1.249);
//        graph.insertEdge("RINGROAD UTARA (MANGGUNG)", "RINGROAD UTARA (MONJALI 2)", 2.198);
////
////        Trayek 2B
//        graph.insertEdge("TERMINAL JOMBOR", "RINGROAD UTARA (MONJALI 1)", 0.949);
//        graph.insertEdge("RINGROAD UTARA (MONJALI 1)", "RINGROAD UTARA (KENTUNGAN)", 1.928);
//        graph.insertEdge("TERMINAL CONDONGCATUR", "SUSTERAN NOVISIAT", 1.202);
//        graph.insertEdge("SUSTERAN NOVISIAT", "SANATA DHARMA", 1.062);
//        graph.insertEdge("SANATA DHARMA", "JL. COLOMBO (SAMIRONO)", 0.443);
//        graph.insertEdge("JL. COLOMBO (SAMIRONO)", "JL. COLOMBO (PANTI RAPIH)", 1.054);
//        graph.insertEdge("JL. COLOMBO (PANTI RAPIH)", "CIK DI TIRO 1 (MUSEUM KOREM)", 0.913);
//        graph.insertEdge("CIK DI TIRO 1 (MUSEUM KOREM)", "SMP 5 YOGYAKARTA", 0.625);
//        graph.insertEdge("SMP 5 YOGYAKARTA", "KENARI 2 (MANDALA KRIDA)", 2.119);
//        graph.insertEdge("KENARI 2 (MANDALA KRIDA)", "KUSUMANEGARA 3 (SGM)", 1.616);
////
//        graph.insertEdge("KUSUMANEGARA 4 (GEDUNG JUANG 45)", "GEDONG KUNING (BANGUNTAPAN)", 0.791);
//        graph.insertEdge("GEDONG KUNING (BANGUNTAPAN)", "NGEKSIGONDO (DIKLAT PU)", 2.154);
//        graph.insertEdge("NGEKSIGONDO (DIKLAT PU)", "PASAR SENI KERAJINAN YOGYAKARTA", 1.508);
//        graph.insertEdge("PASAR SENI KERAJINAN YOGYAKARTA", "SUGIYONO 2 (MUSEUM PERJUANGAN)", 1.581);
//        graph.insertEdge("SUGIYONO 2 (MUSEUM PERJUANGAN)", "KATAMSO 2 (IMMACULATA)", 1.683);
//        graph.insertEdge("KATAMSO 2 (IMMACULATA)", "SENOPATI 1 (TAMAN SENOPATI)", 0.350);
//        graph.insertEdge("SENOPATI 1 (TAMAN SENOPATI)", "KHA DAHLAN 1 (PAPPMI)", 0.766);
//        graph.insertEdge("KHA DAHLAN 1 (PAPPMI)", "NGABEAN", 0.677);
//        graph.insertEdge("NGABEAN", "COKROAMINOTO (SMA 1)", 1.046);
//        graph.insertEdge("COKROAMINOTO (SMA 1)", "SMPN 11", 0.719);
////
//        graph.insertEdge("SMPN 11", "TENTARA PELAJAR 1 (SMP 14)", 1.181);
//        graph.insertEdge("TENTARA PELAJAR 1 (SMP 14)", "AM. SANGAJI 1 (JETIS)", 1.732);
//        graph.insertEdge("AM. SANGAJI 1 (JETIS)", "KARANGJATI", 1.425);
//        graph.insertEdge("KARANGJATI", "RINGROAD UTARA (MONJALI 2)", 1.728);
//        graph.insertEdge("RINGROAD UTARA (MONJALI 2)", "TERMINAL JOMBOR", 0.991);
////
//        //Trayek 3A
//        graph.insertEdge("GIWANGAN", "TEGAL GENDU 2", 1.551);
//        graph.insertEdge("TEGAL GENDU 2", "GEDONG KUNING (DEP.KEHUTANAN)", 1.777);
//        graph.insertEdge("GEDONG KUNING (DEP.KEHUTANAN)", "GEDONG KUNING (JEC)", 2.395);
//        graph.insertEdge("GEDONG KUNING (JEC)", "JL. SOLO (JANTI)", 2.566);
//        graph.insertEdge("JL. SOLO (JANTI)", "JL. SOLO (ALFA)", 0.902);
//        graph.insertEdge("JL. SOLO (ALFA)", "JL. SOLO (MAGUWO)", 0.905);
//        graph.insertEdge("JL. SOLO (MAGUWO)", "BANDARA ADISUCIPTO", 1.071);
//        graph.insertEdge("BANDARA ADISUCIPTO", "RINGROAD UTARA (DISNAKER)", 2.966);
//        graph.insertEdge("RINGROAD UTARA (DISNAKER)", "RINGROAD UTARA (INSTIPER 2)", 1.170);
//        graph.insertEdge("RINGROAD UTARA (INSTIPER 2)", "RINGROAD UTARA (UPN)", 1.774);
////
//        graph.insertEdge("RINGROAD UTARA (UPN)", "TERMINAL CONDONGCATUR", 1.612);
//        graph.insertEdge("TERMINAL CONDONGCATUR", "RINGROAD UTARA (MANGGUNG)", 1.381);
//        graph.insertEdge("RINGROAD UTARA (MANGGUNG)", "FK-UGM", 2.467);
//        graph.insertEdge("FK-UGM", "JL. KALIURANG (KOPMA UGM)", 0.991);
//        graph.insertEdge("JL. KALIURANG (KOPMA UGM)", "CIK DI TIRO 1 (MUSEUM KOREM)", 1.128);
//        graph.insertEdge("SMP 5 YOGYAKARTA", "KOTABARU", 0.819);
//        graph.insertEdge("KOTABARU", "SUDIRMAN 2 (BUMI PUTERA)", 0.383);
//        graph.insertEdge("SUDIRMAN 2 (BUMI PUTERA)", "DIPONEGORO", 0.773);
//        graph.insertEdge("DIPONEGORO", "TENTARA PELAJAR 2 (SAMSAT)", 0.678);
////
//        graph.insertEdge("TENTARA PELAJAR 2 (SAMSAT)", "JLAGRAN", 0.692);
//        graph.insertEdge("JLAGRAN", "MALIOBORO 1 (GARUDA)", 1.138);
//        graph.insertEdge("MALIOBORO 1 (GARUDA)", "MALIOBORO 2 (KEPATIHAN)", 0.492);
//        graph.insertEdge("MALIOBORO 2 (KEPATIHAN)", "AHMAD YANI (BENTENG VREDEBURG)", 0.517);
//        graph.insertEdge("AHMAD YANI (BENTENG VREDEBURG)", "KHA DAHLAN 1 (PAPPMI)", 0.668);
//        graph.insertEdge("NGABEAN", "MT HARYONO 1 (JOKTENG)", 1.182);
//        graph.insertEdge("MT HARYONO 1 (JOKTENG)", "SUGIYONO 1 (SD PUJOKUSUMAN)", 1.416);
//        graph.insertEdge("SUGIYONO 1 (SD PUJOKUSUMAN)", "LOWANU", 1.132);
//        graph.insertEdge("LOWANU", "SOROGENEN (WIROSABAN)", 0.662);
////
//        graph.insertEdge("SOROGENEN (WIROSABAN)", "TEGALTURI 2", 0.870);
//        graph.insertEdge("TEGALTURI 2", "GIWANGAN", 1.528);
////
//        //Trayek 3B
//        graph.insertEdge("GIWANGAN", "TEGALTURI 1", 1.603);
//        graph.insertEdge("TEGALTURI 1", "SOROGENEN (NITIKAN)", 0.771);
//        graph.insertEdge("SOROGENEN (NITIKAN)", "PA MUHAMMADIYAH", 1.093);
//        graph.insertEdge("PA MUHAMMADIYAH", "SUGIYONO 2 (MUSEUM PERJUANGAN)", 0.596);
//        graph.insertEdge("SUGIYONO 2 (MUSEUM PERJUANGAN)", "MT HARYONO 2 (SMA 7)", 1.518);
//        graph.insertEdge("MT HARYONO 2 (SMA 7)", "TEJOKUSUMAN", 0.818);
//        graph.insertEdge("TEJOKUSUMAN", "NGABEAN", 0.535);
//        graph.insertEdge("NGABEAN", "KHA DAHLAN 2 (NGADIWINATAN)", 0.821);
//        graph.insertEdge("KHA DAHLAN 2 (NGADIWINATAN)", "TENTARA PELAJAR 1 (SMP 14)", 2.422);
//        graph.insertEdge("TENTARA PELAJAR 1 (SMP 14)", "SUDIRMAN 3 (GONDOLAYU)", 1.326);
////
//        graph.insertEdge("SUDIRMAN 3 (GONDOLAYU)", "RS DR YAP", 0.855);
//        graph.insertEdge("RS DR YAP", "JL. KALIURANG (PERTANIAN UGM)", 0.913);
//        graph.insertEdge("JL. KALIURANG (PERTANIAN UGM)", "RSUP DR. SARDJITO", 0.801);
//        graph.insertEdge("RSUP DR. SARDJITO", "RINGROAD UTARA (KENTUNGAN)", 2.289);
//        graph.insertEdge("RINGROAD UTARA (KENTUNGAN)", "TERMINAL CONDONGCATUR", 1.691);
//        graph.insertEdge("TERMINAL CONDONGCATUR", "RINGROAD UTARA (JIH)", 1.052);
//        graph.insertEdge("RINGROAD UTARA (JIH)", "RINGROAD UTARA (STIKES GUNA BANGSA)", 0.686);
//        graph.insertEdge("RINGROAD UTARA (STIKES GUNA BANGSA)", "RINGROAD UTARA (INSTIPER 1)", 1.663);
//        graph.insertEdge("RINGROAD UTARA (INSTIPER 1)", "RINGROAD UTARA (BINAMARGA)", 1.751);
//        graph.insertEdge("RINGROAD UTARA (BINAMARGA)", "JL. SOLO (MAGUWO)", 1.101);
////
//        graph.insertEdge("BANDARA ADISUCIPTO", "JL. SOLO (JAYAKARTA)", 2.556);
//        graph.insertEdge("JL. SOLO (JAYAKARTA)", "JANTI FLYOVER", 1.226);
//        graph.insertEdge("JANTI FLYOVER", "RS AU DR. S. HARDJOLUKITO", 1.273);
//        graph.insertEdge("RS AU DR. S. HARDJOLUKITO", "GEDONG KUNING (WONOCATUR)", 0.517);
//        graph.insertEdge("GEDONG KUNING (WONOCATUR)", "GEDONG KUNING (BANGUNTAPAN)", 1.411);
//        graph.insertEdge("GEDONG KUNING (BANGUNTAPAN)", "TEGAL GENDU 1", 3.201);
//        graph.insertEdge("TEGAL GENDU 1", "GIWANGAN", 1.412);
        //--- Pembuatan edge/jarak (end)    

        graph.insertVortex("1");
        graph.insertVortex("2");
        graph.insertVortex("3");
        graph.insertVortex("4");
        graph.insertVortex("5");
        graph.insertVortex("6");
        graph.insertVortex("7");
        graph.insertVortex("8");
        graph.insertVortex("9");
        graph.insertVortex("10");
        
        ArrayList<String> trayek = new ArrayList<String>();
        trayek.add("1A");
        graph.insertEdge("1", "2", 300, trayek);
        trayek = new ArrayList<String>();
        trayek.add("1B");
        graph.insertEdge("1", "3", 200, trayek);
        graph.insertEdge("1", "4", 350, null);
        
        trayek = new ArrayList<String>();
        trayek.add("1A");
        graph.insertEdge("2", "5", 320, trayek);
        graph.insertEdge("2", "6", 350, null);
        graph.insertEdge("2", "7", 400, null);
        
        trayek = new ArrayList<String>();
        trayek.add("1B");
        graph.insertEdge("3", "5", 350, trayek);
        graph.insertEdge("3", "6", 280, null);
        graph.insertEdge("3", "7", 410, null);
        
        
        graph.insertEdge("4", "5", 300, null);
        graph.insertEdge("4", "6", 250, null);
        graph.insertEdge("4", "7", 200, null);
        
        trayek = new ArrayList<String>();
        trayek.add("1B");
        graph.insertEdge("5", "8", 210, trayek);
        trayek = new ArrayList<String>();
        trayek.add("1A");
        graph.insertEdge("5", "9", 230, trayek);
        
        graph.insertEdge("6", "8", 350, null);
        graph.insertEdge("6", "9", 380, null);
        
        graph.insertEdge("7", "8", 290, null);
        graph.insertEdge("7", "9", 400, null);
        
        trayek = new ArrayList<String>();
        trayek.add("1B");
        graph.insertEdge("8", "10", 380, trayek);
        trayek = new ArrayList<String>();
        trayek.add("1A");
        graph.insertEdge("9", "10", 280, trayek);
        
        List<String> jalurPilihan = new ArrayList<String>();
        Stack stackJalur = graph.floyd("1", "10");
        while (!stackJalur.isEmpty()) {
            jalurPilihan.add(stackJalur.pop().toString());
        }
        List<List> daftarTrayek = new ArrayList<List>();
        for (int i = 0; i < jalurPilihan.size(); i++) {
            if (i != 0) {
                int awal = graph.findIndex(jalurPilihan.get(i - 1));
                int tujuan = graph.findIndex(jalurPilihan.get(i));
                daftarTrayek.add(graph.edgeTrayek[awal][tujuan]);
            }
        }
//        for (int i = 0; i < daftarTrayek.size(); i++) {
//            for (int j = 0; j < daftarTrayek.get(i).size(); j++) {
//                System.out.println(daftarTrayek.get(i).get(j));
//            }
//            System.out.println("-----");
        List<String> bantu = daftarTrayek.get(0);
        for (int i = 1; i < daftarTrayek.size(); i++) {
            List<String> baru = new ArrayList<String>();
            for (int j = 0; j < bantu.size(); j++) {
                for (int k = 0; k < daftarTrayek.get(i).size(); k++) {
                    if (bantu.get(j).equals(daftarTrayek.get(i).get(k))) {
                        baru.add(bantu.get(j));
                    }
                    
                }
            }
            if (baru.isEmpty()) {
                for (int j = 0; j < bantu.size(); j++) {
                    System.out.print(bantu.get(j));
                }
                System.out.print(" pindah di halte: "+jalurPilihan.get(i)+" ke trayek ");
                bantu = daftarTrayek.get(i);
                
            } else {
                bantu = baru;
            }
        }
        for (int i = 0; i < bantu.size(); i++) {
            System.out.println(bantu.get(i));          
        }
//
//        List<String> trayek1A = new ArrayList<String>();
//        trayek1A.add("Trayek 1 A");
//        trayek1A.add("1");
//        trayek1A.add("2");
//        trayek1A.add("5");
//        trayek1A.add("9");
//        trayek1A.add("10");
//        List<String> trayek1B = new ArrayList<String>();
//        trayek1B.add("Trayek 1 B");
//        trayek1B.add("1");
//        trayek1B.add("3");
//        trayek1B.add("5");
//        trayek1B.add("8");
//        trayek1B.add("10");
//        List<String> trayek1C = new ArrayList<String>();
//        trayek1C.add("Trayek 1 C");
//        trayek1C.add("1");
//        trayek1C.add("3");
//        trayek1C.add("5");
//        trayek1C.add("8");
//        trayek1C.add("10");
//        List<List> trayeks = new ArrayList<List>();

//        List<String> trayekPilihan = new ArrayList<String>();
//////
//        for (int i = 0; i < jalurPilihan.size(); i++) {
//            trayeks.add(graph.daftarVertex[graph.findIndex(jalurPilihan.get(i))].flagTrayek);
//        }
//        
//        for (int i = 0; i < trayeks.size(); i++) {
//            for (int j = 0; j < trayeks.get(i).size(); j++) {
//                if (i!=0){
//                    for (int k = 0; k < trayeks.get(i-1).size(); k++) {
//                        
//                        
//                    }
//                }
//                
//            }
//             System.out.println("---");
//            
//        }
//        trayeks.add(trayek1A);
//        trayeks.add(trayek1B);
//        trayeks.add(trayek1C);
//        int counter = 0;
//        int counter2 = 0;
//        int index = 0;
//        int index2 = 1;
//        String trayekz = "";

//        while (index < trayeks.size()) {
//            while (index2 < trayeks.get(index).size()) {
//                if (trayeks.get(index).get(index2).
//                        equals(jalurPilihan.get(counter2))) {
//                    counter++;
//                    counter2++;
//                    if (counter == jalurPilihan.size()) {
//                        trayekPilihan.add(trayeks.get(index).get(0).toString());
//                        counter = 0;
//                        counter2 = 0;
//                        break;
//                    } else {
//                        index2++;
//                    }
//                } else {
//                    break;
//                }
//
//            }
//            index2 = 1;
//            index++;
//        }
//        System.out.println("hello world");



//        for (int i = 0; i < trayekPilihan.size(); i++) {
//            System.out.println(trayekPilihan.get(i).toString());
//
//        }
//
//        for (int i = 0; i < jalurPilihan.size(); i++) {
//        }

//        double startTime=System.nanoTime();
//        graph.dijkstra("RINGROAD UTARA (INSTIPER 1)", "TENTARA PELAJAR 2 (SAMSAT)");
//        double finishTime=System.nanoTime();
//        System.out.println("Elapsed Time: "+(finishTime-startTime));
//        System.out.println("-------------------------------------------------");
//        double startTime2=System.nanoTime();
//        graph.floyd("RINGROAD UTARA (INSTIPER 1)", "TENTARA PELAJAR 2 (SAMSAT)");
//        double finishTime2=System.nanoTime();
//        System.out.println("Elapsed Time: "+(finishTime2-startTime2));
    }
}
