package com.spring.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	/*
	 * // string operators public Book findByTitle(String title);
	 * 
	 * public List<Book> findByTitleLike(String title);
	 * 
	 * public List<Book> findByTitleContaining(String title);
	 * 
	 * public List<Book> findByTitleStartingWith(String title);
	 * 
	 * public List<Book> findByTitleEndingWith(String title);
	 * 
	 * public List<Book> findByTitleIgnoreCase(String title);
	 * 
	 * // relational operators public List<Book> findByPageCountEquals(int
	 * pageCount);
	 * 
	 * public List<Book> findByPageCountGreaterThan(int pagecount);
	 * 
	 * public List<Book> findByPageCountLessThan(int pagecount);
	 * 
	 * public List<Book> findByPageCountGreaterThanEqual(int pagecount);
	 * 
	 * public List<Book> findByPageCountLessThanEqual(int pagecount);
	 * 
	 * public List<Book> findByPageCountBetween(int min, int max);
	 * 
	 * // logical operators public List<Book>
	 * findByTitleContainingOrPageCountGreaterThan(String title, int pagecount);
	 * 
	 * public List<Book> findByTitleContainingAndPageCountGreaterThan(String
	 * title, int pagecount);
	 * 
	 * public List<Book> findByTitleNot(String title);
	 * 
	 * // date operators public List<Book> findByPublishDateAfter(Date date);
	 * 
	 * public List<Book> findByPublishDateBefore(Date date);
	 * 
	 * public List<Book> findByPublishDateBetween(Date date, Date date1);
	 * 
	 * // order operators public List<Book>
	 * findByTitleContainingOrderByTitleAsc(String title);
	 * 
	 * public List<Book> findByTitleContainingOrderByTitleDesc(String title);
	 * 
	 * public List<Book> findTopByOrderByPageCountDesc();
	 * 
	 * public List<Book> findFirstByOrderByPageCountAsc();
	 * 
	 * public List<Book> findTop9ByOrderByPageCountAsc();
	 * 
	 * public List<Book> findTop9ByTitleOrderByPriceAsc();
	 */

	public List<Book> queryOne(Pageable pageable);

	public List<Book> query(int pageCount);

	public List<Book> queri(@Param("title") String title);
}
