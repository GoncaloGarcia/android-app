package fr.gaulupeau.apps.Poche.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import fr.gaulupeau.apps.Poche.entity.Article;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ARTICLE".
*/
public class ArticleDao extends AbstractDao<Article, Long> {

    public static final String TABLENAME = "ARTICLE";

    /**
     * Properties of entity Article.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ArticleId = new Property(1, Integer.class, "articleId", false, "article_id");
        public final static Property Content = new Property(2, String.class, "content", false, "content");
        public final static Property Author = new Property(3, String.class, "author", false, "author");
        public final static Property Title = new Property(4, String.class, "title", false, "title");
        public final static Property Url = new Property(5, String.class, "url", false, "url");
        public final static Property Favorite = new Property(6, Boolean.class, "favorite", false, "favorite");
        public final static Property Archive = new Property(7, Boolean.class, "archive", false, "archive");
        public final static Property UpdateDate = new Property(8, java.util.Date.class, "updateDate", false, "update_date");
        public final static Property ArticleProgress = new Property(9, Double.class, "articleProgress", false, "article_progress");
    };


    public ArticleDao(DaoConfig config) {
        super(config);
    }
    
    public ArticleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ARTICLE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"article_id\" INTEGER UNIQUE ," + // 1: articleId
                "\"content\" TEXT," + // 2: content
                "\"author\" TEXT," + // 3: author
                "\"title\" TEXT," + // 4: title
                "\"url\" TEXT," + // 5: url
                "\"favorite\" INTEGER," + // 6: favorite
                "\"archive\" INTEGER," + // 7: archive
                "\"update_date\" INTEGER," + // 8: updateDate
                "\"article_progress\" REAL);"); // 9: articleProgress
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ARTICLE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Article entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer articleId = entity.getArticleId();
        if (articleId != null) {
            stmt.bindLong(2, articleId);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        Boolean favorite = entity.getFavorite();
        if (favorite != null) {
            stmt.bindLong(7, favorite ? 1L: 0L);
        }
 
        Boolean archive = entity.getArchive();
        if (archive != null) {
            stmt.bindLong(8, archive ? 1L: 0L);
        }
 
        java.util.Date updateDate = entity.getUpdateDate();
        if (updateDate != null) {
            stmt.bindLong(9, updateDate.getTime());
        }
 
        Double articleProgress = entity.getArticleProgress();
        if (articleProgress != null) {
            stmt.bindDouble(10, articleProgress);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Article readEntity(Cursor cursor, int offset) {
        Article entity = new Article( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // articleId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // favorite
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // archive
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // updateDate
            cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9) // articleProgress
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Article entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArticleId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFavorite(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setArchive(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setUpdateDate(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setArticleProgress(cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Article entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Article entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}