package com.noteshare.view;

import java.util.ArrayList;

import com.noteshare.controller.NoteStore;
import com.noteshare.entity.TextAndImageNote;
import com.noteshare.entity.TextNote;

public class Launcher {
	public void displayTextNotes(ArrayList<TextNote> tnList) {
		int i=1;
		for(TextNote tn : tnList) {
			System.out.println("Text Note "+i+": "+tn.getTextNote());
			i = i+1;
		}
	}
	public void displayTextAndImageNotes(ArrayList<TextAndImageNote> tainList) {
		int i=1;
		for(TextAndImageNote tain : tainList) {
			System.out.println("Text And Image Note "+i+": "+tain.getTextNote()+", "+tain.getImageUrl());
			i = i+1;
		}
	}
	
	public static void main(String[] args) {
		TextNote tn1 = new TextNote();
		TextNote tn2 = new TextNote();
		TextAndImageNote tain1 = new TextAndImageNote();
		TextAndImageNote tain2 = new TextAndImageNote();
		
		tn1.setTextNote("Hello Everyone");
		tn2.setTextNote("This is HSBC");
		
		tain1.setTextNote("HSBC");
		tain1.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.phonethem.co.uk%2Fwp-content%2Fuploads%2F2018%2F02%2F&psig=AOvVaw1kk_EkU_OTK7Ck3r7nLDMv&ust=1604488008441000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCJ7-Cd5uwCFQAAAAAdAAAAABAE");
		
		tain2.setTextNote("London Bridge");
		tain2.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Findianexpress.com%2Farticle%2Ftrending%2Ftrending-globally%2Flondon-bridge-is-falling-down-tweet-netizens-after-tower-bridge-gets-stuck-6566414%2F&psig=AOvVaw25-MZKyXNPQBfRuI3_MqQr&ust=1604488065029000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLDdtvud5uwCFQAAAAAdAAAAABAD");
		
		NoteStore ns = new NoteStore();
		ns.storeNote(tn1);
		ns.storeNote(tn2);
		ns.storeNote(tain1);
		ns.storeNote(tain2);
		
		Launcher l = new Launcher();
		l.displayTextNotes(ns.getAllTextNotes());
		l.displayTextAndImageNotes(ns.getAllTextAndImageNotes());
	}
}
