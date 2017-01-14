using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNPackageName
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNPackageNameModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNPackageNameModule"/>.
        /// </summary>
        internal RNPackageNameModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNPackageName";
            }
        }
    }
}
