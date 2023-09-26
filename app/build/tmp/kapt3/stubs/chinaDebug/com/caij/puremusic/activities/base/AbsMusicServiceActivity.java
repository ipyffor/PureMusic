package com.caij.puremusic.activities.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\tH\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;", "Lcom/caij/puremusic/activities/base/AbsBaseActivity;", "Lcom/caij/puremusic/interfaces/IMusicServiceEventListener;", "()V", "mMusicServiceEventListeners", "Ljava/util/ArrayList;", "musicStateReceiver", "Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity$MusicStateReceiver;", "receiverRegistered", "", "repository", "Lcom/caij/puremusic/repository/RealRepository;", "getRepository", "()Lcom/caij/puremusic/repository/RealRepository;", "repository$delegate", "Lkotlin/Lazy;", "serviceToken", "Lcom/caij/puremusic/helper/MusicPlayerRemote$ServiceToken;", "addMusicServiceEventListener", "", "listenerI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFavoriteStateChanged", "onHasPermissionsChanged", "hasPermissions", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "removeMusicServiceEventListener", "Companion", "MusicStateReceiver", "app_chinaDebug"})
public abstract class AbsMusicServiceActivity extends com.caij.puremusic.activities.base.AbsBaseActivity implements com.caij.puremusic.interfaces.IMusicServiceEventListener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.caij.puremusic.interfaces.IMusicServiceEventListener> mMusicServiceEventListeners = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.helper.MusicPlayerRemote.ServiceToken serviceToken;
    @org.jetbrains.annotations.Nullable()
    private com.caij.puremusic.activities.base.AbsMusicServiceActivity.MusicStateReceiver musicStateReceiver;
    private boolean receiverRegistered = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.activities.base.AbsMusicServiceActivity.Companion Companion = null;
    
    public AbsMusicServiceActivity() {
        super();
    }
    
    private final com.caij.puremusic.repository.RealRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void addMusicServiceEventListener(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.interfaces.IMusicServiceEventListener listenerI) {
    }
    
    public final void removeMusicServiceEventListener(@org.jetbrains.annotations.Nullable()
    com.caij.puremusic.interfaces.IMusicServiceEventListener listenerI) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onFavoriteStateChanged() {
    }
    
    @java.lang.Override()
    protected void onHasPermissionsChanged(boolean hasPermissions) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_chinaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity$MusicStateReceiver;", "Landroid/content/BroadcastReceiver;", "activity", "Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;", "(Lcom/caij/puremusic/activities/base/AbsMusicServiceActivity;)V", "reference", "Ljava/lang/ref/WeakReference;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_chinaDebug"})
    static final class MusicStateReceiver extends android.content.BroadcastReceiver {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.ref.WeakReference<com.caij.puremusic.activities.base.AbsMusicServiceActivity> reference = null;
        
        public MusicStateReceiver(@org.jetbrains.annotations.NotNull()
        com.caij.puremusic.activities.base.AbsMusicServiceActivity activity) {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
}