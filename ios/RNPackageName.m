
#import "RNPackageName.h"

@implementation RNPackageName

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

- (NSDictionary<NSString *,id> *)constantsToExport {
    return @{@"PACKAGE_NAME": [[NSBundle mainBundle] bundleIdentifier]};
}

@end
  
