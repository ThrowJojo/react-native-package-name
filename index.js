
import { NativeModules } from 'react-native';
const { RNPackageName } = NativeModules;

class PackageName {

    static getPackageName = () => {
        return RNPackageName.PACKAGE_NAME;
    };

}

module.exports.PackageName = PackageName;
