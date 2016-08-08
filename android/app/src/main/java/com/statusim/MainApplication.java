package com.statusim;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import com.statusim.Jail.JailPackage;
import io.realm.react.RealmReactPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.rt2zz.reactnativecontacts.ReactNativeContacts;
import com.i18n.reactnativei18n.ReactNativeI18n;
import com.bitgo.randombytes.RandomBytesPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.lwansbrough.RCTCamera.*;
import com.centaurwarchief.smslistener.SmsListenerPackage;
import com.github.yamill.orientation.OrientationPackage;
import com.rnfs.RNFSPackage;
import com.statusim.geth.module.GethPackage;
import com.aakashns.reactnativedialogs.ReactNativeDialogsPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import com.reactnative.picker.PickerPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
              new MainReactPackage(),
              new JailPackage(),
              new RealmReactPackage(),
              new VectorIconsPackage(),
              new ReactNativeContacts(),
              new ReactNativeI18n(),
              new RandomBytesPackage(),
              new LinearGradientPackage(),
              new RCTCameraPackage(),
              new SmsListenerPackage(),
              new OrientationPackage(),
              new RNFSPackage(),
              new GethPackage(),
              new ReactNativeDialogsPackage(),
              new ImageResizerPackage(),
              new PickerPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
      return mReactNativeHost;
  }
}