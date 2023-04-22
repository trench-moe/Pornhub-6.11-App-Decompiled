package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes3.dex */
public abstract class SimplePlatform {
    private final String platformName;
    private final TargetPlatformVersion targetPlatformVersion;

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return this.platformName + " (" + targetName + ')';
        }
        return this.platformName;
    }
}
