package org.example.designpatterns.factory;

public class Flutter {

   static UIFactory getUIFactoryByPlatform(Platform platform) throws Exception {
       if(platform.equals(Platform.IOS)){
           return new IOSUIFactory();
       }else if(platform.equals(Platform.ANDROID)){
           return new AndroidUIFactory();
       }else{
           throw new UnsupportedOperationException("This platform is not available yet..!");
       }
   }
}
