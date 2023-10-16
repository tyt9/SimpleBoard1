package com.study.simpleboard1.service;

import com.study.simpleboard1.entity.Notice;
import com.study.simpleboard1.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor  // auto-wired
public class NoticeServiceImpl implements NoticeService{
    private final NoticeRepository noticeRepository;
    @Override
    public Notice saveReply(Notice notice) {
        notice.setSeq(notice.getSeq()-1);
        Notice notice1 = noticeRepository.save(notice);
        return noticeRepository
                .findById(notice1.getSeq()).orElseThrow();
    }
}