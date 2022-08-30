package vicdron.com.politicsticker;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.ads.AdView;

class StickerPreviewViewHolder extends RecyclerView.ViewHolder {

    final SimpleDraweeView stickerPreviewView;

    StickerPreviewViewHolder(final View itemView) {
        super(itemView);
        stickerPreviewView = itemView.findViewById(R.id.sticker_preview);

    }
}