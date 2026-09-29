package com.xworkz.equalsmethodapp;

public class SoundBox {
    public String brand;
    public int speakerMaximumOutputPowerInWatts;
    public String frequency;
    public String AudioOutputMode;

    @Override
    public boolean equals(Object object){

        SoundBox soundBox=(SoundBox)object;

        if(this.brand.equals(soundBox.brand) && this.speakerMaximumOutputPowerInWatts==soundBox.speakerMaximumOutputPowerInWatts && this.frequency.equals(soundBox.frequency) && this.AudioOutputMode.equals(soundBox.AudioOutputMode))
       return  true;
        return false;
    }
}
