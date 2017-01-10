package com.trebonius.phototo.server;

import com.google.gson.annotations.Expose;
import java.util.Collection;
import com.trebonius.phototo.core.entities.PhototoFolder;
import com.trebonius.phototo.core.entities.PhototoPicture;

public class PhototoServerResponse {

    @Expose
    public final Collection<PhototoFolder> folders;

    @Expose
    public final Collection<PhototoPicture> pictures;

    @Expose
    public final int beginIndex;

    @Expose
    public final int endIndex;

    @Expose
    public final boolean hasMore;

    public PhototoServerResponse(Collection<PhototoFolder> folders, Collection<PhototoPicture> pictures, int beginIndex, int endIndex, boolean hasMore) {
        this.folders = folders;
        this.pictures = pictures;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
        this.hasMore = hasMore;
    }

}