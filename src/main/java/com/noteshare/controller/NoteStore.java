package com.noteshare.controller;

import java.util.ArrayList;

import com.noteshare.entity.TextAndImageNote;
import com.noteshare.entity.TextNote;

public class NoteStore {
	private ArrayList<TextNote> tnList = new ArrayList<TextNote>();
	private ArrayList<TextAndImageNote> tainList = new ArrayList<TextAndImageNote>();
	public void storeNote(TextNote tn) {
		tnList.add(tn);
	}
	public void storeNote(TextAndImageNote tain) {
		tainList.add(tain);
	}
	
	public ArrayList<TextNote> getAllTextNotes(){
		return tnList;
	}
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes(){
		return tainList;
	}
}
