From python:3.6-alpine

RUN pip install --quiet elasticsearch-curator

COPY config/ /etc/curator/

RUN /usr/bin/crontab /etc/curator/crontab.txt

CMD ["/usr/sbin/crond","-f"]

#ENTRYPOINT [ "/usr/local/bin/curator","--config","/etc/curator/config.yml","/etc/curator/action.yml" ]

