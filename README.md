
# react-native-package-name

## Getting started

`$ npm install react-native-package-name --save`

### Mostly automatic installation

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNPackageName.sln` in `node_modules/react-native-package-name/windows/RNPackageName.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Cl.Json.RNPackageName;` to the usings at the top of the file
  - Add `new RNPackageNamePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNPackageName from 'react-native-package-name';

// TODO: What do with the module?
RNPackageName;
```
  