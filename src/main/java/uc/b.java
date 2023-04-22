package uc;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements View.OnClickListener {
    public b(g gVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context = view.getContext();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.google.vrtoolkit.cardboard.CONFIGURE");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (str.startsWith("com.google.")) {
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        if (arrayList.isEmpty()) {
            new i().show(((Activity) context).getFragmentManager(), "InstallCardboardDialog");
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent", intent);
        hVar.setArguments(bundle);
        hVar.show(fragmentManager, "ConfigureCardboardDialog");
    }
}
