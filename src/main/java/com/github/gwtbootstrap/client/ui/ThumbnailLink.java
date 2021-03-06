package com.github.gwtbootstrap.client.ui;

import com.github.gwtbootstrap.client.ui.base.HasSize;
import com.github.gwtbootstrap.client.ui.base.SizeHelper;
import com.github.gwtbootstrap.client.ui.constants.Constants;

/**
 * The thumbnail be wrapped by Anchor.
 * 
 * @since 2.1.1.0
 * @author ohashi keisuke
 * @see Thumbnails
 * @see Thumbnail
 * @see <a href="http://twitter.github.com/bootstrap/components.html#thumbnails">Twitter Bootstrap Documentation</a>
 */
public class ThumbnailLink extends NavWidget implements HasSize {

    /**
     * Create an empty Thumbnail
     */
    public ThumbnailLink() {
        super();
        getAnchor().setStyleName(Constants.THUMBNAIL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSize(int size) {
        SizeHelper.setSize(this, size);
    }
    
}
