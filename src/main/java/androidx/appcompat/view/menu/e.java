package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import c0.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.z;

/* loaded from: classes.dex */
public class e implements h0.a {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f642a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f643b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f644c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public a f645e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f646f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f647g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f648h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<g> f649i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f650j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f651k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f653m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public View f654o;

    /* renamed from: v  reason: collision with root package name */
    public g f661v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f663x;

    /* renamed from: l  reason: collision with root package name */
    public int f652l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f655p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f656q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f657r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f658s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f659t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f660u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f662w = false;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f642a = context;
        Resources resources = context.getResources();
        this.f643b = resources;
        this.f646f = new ArrayList<>();
        this.f647g = new ArrayList<>();
        this.f648h = true;
        this.f649i = new ArrayList<>();
        this.f650j = new ArrayList<>();
        this.f651k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = z.f13174a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.d = z11;
    }

    public void A() {
        if (this.f655p) {
            return;
        }
        this.f655p = true;
        this.f656q = false;
        this.f657r = false;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = y;
            if (i14 < iArr.length) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                g gVar = new g(this, i10, i11, i12, i15, charSequence, this.f652l);
                ArrayList<g> arrayList = this.f646f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i13 = 0;
                        break;
                    } else if (arrayList.get(size).d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                }
                arrayList.add(i13, gVar);
                p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f643b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f643b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f642a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f643b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f643b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f642a, this, gVar);
        gVar.f679o = lVar;
        lVar.setHeaderTitle(gVar.f670e);
        return lVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar, Context context) {
        this.f660u.add(new WeakReference<>(iVar));
        iVar.j(context, this);
        this.f651k = true;
    }

    public final void c(boolean z10) {
        if (this.f658s) {
            return;
        }
        this.f658s = true;
        Iterator<WeakReference<i>> it = this.f660u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f660u.remove(next);
            } else {
                iVar.d(this, z10);
            }
        }
        this.f658s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f661v;
        if (gVar != null) {
            d(gVar);
        }
        this.f646f.clear();
        p(true);
    }

    public void clearHeader() {
        this.n = null;
        this.f653m = null;
        this.f654o = null;
        p(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        r1 = r3.g(r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(androidx.appcompat.view.menu.g r8) {
        /*
            r7 = this;
            r4 = r7
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f660u
            r6 = 5
            boolean r0 = r0.isEmpty()
            r6 = 0
            r1 = r6
            if (r0 != 0) goto L4c
            androidx.appcompat.view.menu.g r0 = r4.f661v
            if (r0 == r8) goto L12
            r6 = 6
            goto L4c
        L12:
            r4.A()
            r6 = 4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r0 = r4.f660u
            java.util.Iterator r0 = r0.iterator()
        L1c:
            r6 = 7
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            r6 = 5
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r6 = 2
            java.lang.Object r6 = r2.get()
            r3 = r6
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto L3b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r4.f660u
            r6 = 1
            r3.remove(r2)
            goto L1d
        L3b:
            boolean r1 = r3.g(r4, r8)
            if (r1 == 0) goto L1c
        L41:
            r4.z()
            if (r1 == 0) goto L4c
            r6 = 5
            r6 = 0
            r8 = r6
            r4.f661v = r8
            r6 = 3
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.d(androidx.appcompat.view.menu.g):boolean");
    }

    public boolean e(e eVar, MenuItem menuItem) {
        a aVar = this.f645e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (this.f660u.isEmpty()) {
            return false;
        }
        A();
        Iterator<WeakReference<i>> it = this.f660u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f660u.remove(next);
            } else {
                z10 = iVar.h(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        z();
        if (z10) {
            this.f661v = gVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f646f.get(i11);
            if (gVar.f667a == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f679o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public g g(int i10, KeyEvent keyEvent) {
        int i11;
        ArrayList<g> arrayList = this.f659t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = n();
        for (i11 = 0; i11 < size; i11 = i11 + 1) {
            g gVar = arrayList.get(i11);
            char c10 = n ? gVar.f675j : gVar.f673h;
            char[] cArr = keyData.meta;
            if (c10 == cArr[0] && (metaState & 2) == 0) {
                return gVar;
            }
            i11 = ((c10 != cArr[2] || (metaState & 2) == 0) && !(n && c10 == '\b' && i10 == 67)) ? i11 + 1 : 0;
            return gVar;
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f646f.get(i10);
    }

    public void h(List<g> list, int i10, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f646f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f646f.get(i11);
                if (gVar.hasSubMenu()) {
                    gVar.f679o.h(list, i10, keyEvent);
                }
                char c10 = n ? gVar.f675j : gVar.f673h;
                if (((modifiers & 69647) == ((n ? gVar.f676k : gVar.f674i) & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n && c10 == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f663x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f646f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<g> l10 = l();
        if (this.f651k) {
            Iterator<WeakReference<i>> it = this.f660u.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f660u.remove(next);
                } else {
                    z10 |= iVar.f();
                }
            }
            if (z10) {
                this.f649i.clear();
                this.f650j.clear();
                int size = l10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = l10.get(i10);
                    if (gVar.g()) {
                        this.f649i.add(gVar);
                    } else {
                        this.f650j.add(gVar);
                    }
                }
            } else {
                this.f649i.clear();
                this.f650j.clear();
                this.f650j.addAll(l());
            }
            this.f651k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public e k() {
        return this;
    }

    public ArrayList<g> l() {
        if (this.f648h) {
            this.f647g.clear();
            int size = this.f646f.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = this.f646f.get(i10);
                if (gVar.isVisible()) {
                    this.f647g.add(gVar);
                }
            }
            this.f648h = false;
            this.f651k = true;
            return this.f647g;
        }
        return this.f647g;
    }

    public boolean m() {
        return this.f662w;
    }

    public boolean n() {
        return this.f644c;
    }

    public boolean o() {
        return this.d;
    }

    public void p(boolean z10) {
        if (this.f655p) {
            this.f656q = true;
            if (z10) {
                this.f657r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f648h = true;
            this.f651k = true;
        }
        if (this.f660u.isEmpty()) {
            return;
        }
        A();
        Iterator<WeakReference<i>> it = this.f660u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f660u.remove(next);
            } else {
                iVar.e(z10);
            }
        }
        z();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g g10 = g(i10, keyEvent);
        boolean r10 = g10 != null ? r(g10, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return r10;
    }

    public boolean q(MenuItem menuItem, int i10) {
        return r(menuItem, null, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(android.view.MenuItem r11, androidx.appcompat.view.menu.i r12, int r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.r(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f646f.get(i11).f668b == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = this.f646f.size() - i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size2 || this.f646f.get(i11).f668b != i10) {
                    break;
                }
                s(i11, false);
                i12 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f646f.get(i11).f667a == i10) {
                break;
            } else {
                i11++;
            }
        }
        s(i11, true);
    }

    public final void s(int i10, boolean z10) {
        if (i10 >= 0) {
            if (i10 >= this.f646f.size()) {
                return;
            }
            this.f646f.remove(i10);
            if (z10) {
                p(true);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f646f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f646f.get(i11);
            if (gVar.f668b == i10) {
                gVar.k(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f662w = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f646f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f646f.get(i11);
            if (gVar.f668b == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f646f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f646f.get(i11);
            if (gVar.f668b == i10 && gVar.m(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f644c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f646f.size();
    }

    public void t(i iVar) {
        Iterator<WeakReference<i>> it = this.f660u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f660u.remove(next);
            }
        }
    }

    public void u(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).u(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            if (this.f660u.isEmpty()) {
                return;
            }
            Iterator<WeakReference<i>> it = this.f660u.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f660u.remove(next);
                } else {
                    int a10 = iVar.a();
                    if (a10 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(a10)) != null) {
                        iVar.k(parcelable);
                    }
                }
            }
        }
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public void x(Bundle bundle) {
        Parcelable n;
        if (this.f660u.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<i>> it = this.f660u.iterator();
        while (true) {
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f660u.remove(next);
                } else {
                    int a10 = iVar.a();
                    if (a10 > 0 && (n = iVar.n()) != null) {
                        sparseArray.put(a10, n);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
            return;
        }
    }

    public final void y(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f643b;
        if (view != null) {
            this.f654o = view;
            this.f653m = null;
            this.n = null;
        } else {
            if (i10 > 0) {
                this.f653m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f653m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f642a;
                Object obj = c0.a.f3717a;
                this.n = a.c.b(context, i11);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f654o = null;
        }
        p(false);
    }

    public void z() {
        this.f655p = false;
        if (this.f656q) {
            this.f656q = false;
            p(this.f657r);
        }
    }
}
