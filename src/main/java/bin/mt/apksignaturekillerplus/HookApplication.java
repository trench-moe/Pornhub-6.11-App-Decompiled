package bin.mt.apksignaturekillerplus;

import android.content.Context;
import com.app.pornhub.PornhubApplication;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class HookApplication extends PornhubApplication {

    /* renamed from: a  reason: collision with root package name */
    public static String f3715a;

    @Override // com.app.pornhub.PornhubApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        f3715a = "OTI6N0M6QTQ6NDk6NDk6RDc6Nzg6OEE6QTg6NkY6OUQ6N0Y6MDQ6RDc6RkQ6QUM6RUM6RDE6REY6Qjk=";
        try {
            File file = new File(context.getCacheDir(), "hook");
            File file2 = new File(file, "opt");
            File file3 = new File(file, "classes.dex");
            file2.mkdirs();
            ZipFile zipFile = new ZipFile(context.getPackageResourcePath());
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("mthook/hook.dex"));
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            zipFile.close();
            new DexClassLoader(file3.getPath(), file2.getPath(), context.getApplicationInfo().nativeLibraryDir, ClassLoader.getSystemClassLoader()).loadClass("cc.binmt.signature.Hook").getMethod("bind", Context.class).invoke(null, context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.attachBaseContext(context);
    }
}
