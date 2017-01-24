
# react-native-package-name

A library to get a project's package name in Android so you can link to the app's Play Store listing page for reviews/sharing. If this module is used in iOS it will get the Bundle Identifier string instead.

## Getting started

`$ npm install react-native-package-name --save`

### Automatic(link) installation

`$ react-native link react-native-package-name`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-package-name` and add `RNPackageName.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNPackageName.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNPackageNamePackage;` to the imports at the top of the file
  - Add `new RNPackageNamePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-package-name'
  	project(':react-native-package-name').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-package-name/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-package-name')
  	```

## Usage
```javascript
import { PackageName } from 'react-native-package-name';
let packageName = PackageName.getPackageName();
// Do something with packageName
```
  
